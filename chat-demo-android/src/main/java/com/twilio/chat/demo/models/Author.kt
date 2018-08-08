package com.twilio.chat.demo.models

import com.twilio.chat.demo.R.id.avatar
import android.R.attr.name
import com.stfalcon.chatkit.commons.models.IUser
import com.twilio.chat.Member
import com.twilio.chat.Members


/**
 * Created by Harikesh on 8/7/2018.
 */

open class Author(val member: Member) : IUser {

    /*...*/

    override fun getId(): String {
        return member.identity
    }

    override fun getName(): String {
        return member.sid
    }

    override fun getAvatar(): String {
        return ""
    }
}