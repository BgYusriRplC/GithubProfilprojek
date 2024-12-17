package id.ac.polbeng.muhammadyusri.githubprojek.helpers

import id.ac.polbeng.muhammadyusri.githubprojek.BuildConfig

class Config {
    companion object {
        const val SPLASH_SCREEN_DELAY: Long = 3000
        const val BASE_URL = "https://api.github.com"
        const val DEFAULT_USER_LOGIN = "BgYusriRplC"
        const val PERSONAL_ACCESS_TOKEN = "Bearer ${BuildConfig.ACCESS_TOKEN}"
    }
}
