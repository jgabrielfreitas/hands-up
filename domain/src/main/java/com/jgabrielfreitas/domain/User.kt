package com.jgabrielfreitas.domain

import java.util.UUID

data class User(val id: UUID, val email: String, val password: String)