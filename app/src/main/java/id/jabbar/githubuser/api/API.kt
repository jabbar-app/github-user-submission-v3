package id.jabbar.githubuser.api

import id.jabbar.githubuser.data.model.DetailUserResponse
import id.jabbar.githubuser.data.model.User
import id.jabbar.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface API {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}