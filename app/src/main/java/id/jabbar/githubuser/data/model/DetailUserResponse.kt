package id.jabbar.githubuser.data.model

data class DetailUserResponse (
    val login: String,
    val id: String,
    val avatar_url: String,
    val followers_url: String,
    val following_url: String,
    val followers: Int,
    val following: Int,
    val name: String,
)