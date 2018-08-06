import uuid

all_users = []


def users_registered():
    return all_users


def find_user(email):
    for user in all_users:
        if user.email == email:
            return user

    return None


def register_user(user):
    all_users.append(user)
    [print(user.email) for user in all_users]


class User:
    def __init__(self, email, password):
        self.id = uuid.uuid4()
        self.email = email
        self.password = password
