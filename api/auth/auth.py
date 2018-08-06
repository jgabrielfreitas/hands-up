from data.user import all_users


class AuthHelper:
    @staticmethod
    def check_user(user_received):
        for user in all_users:
            if user.email == user_received.email and \
                            user.password == user_received.password:
                return user

        return None
