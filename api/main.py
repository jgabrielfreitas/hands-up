import uuid
from http import HTTPStatus

from flask import Flask, jsonify, request

from auth.auth import AuthHelper
from data.user import User, find_user, register_user

app = Flask(__name__)


def parse_user(request):
    data = request.get_json()
    email = data['email']
    password = data['password']
    return User(email, password)


@app.route("/register", methods=['POST'])
def register():
    user = parse_user(request)

    find_user_result = find_user(user.email)

    if find_user_result is None:
        register_user(user)
    else:
        user = find_user_result

    response = {
        "id": user.id,
        "email": user.email
    }

    return jsonify(response), HTTPStatus.OK


@app.route("/auth", methods=['POST'])
def login():
    user = parse_user(request)

    user_check_result = AuthHelper.check_user(user)
    response = {}

    if user_check_result:
        response = {
            "id": user_check_result.id,
            "email": user_check_result.email
        }

    bad_request_response = {
        "message": "incorrect password or user not found"
    }

    return (jsonify(response), HTTPStatus.OK) \
        if user_check_result is not None \
        else (jsonify(bad_request_response), HTTPStatus.UNAUTHORIZED)


if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
