package com.parisa.fluttycatgeek.testrecycler

import androidx.annotation.Keep
import java.sql.Timestamp

data class UsersFieldDto(
    @Keep var id: Int,
    @Keep var name: String,
    //@Keep var meta_name: String

    //dont need
    /*@Keep var deleted_at: Timestamp,
    @Keep var created_at: Timestamp? = null,
    @Keep var updated_at: Timestamp*/
)
