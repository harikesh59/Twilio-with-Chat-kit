package com.twilio.chat.demo.views

import android.content.Context
import android.view.ViewGroup
import android.widget.TextView
import com.twilio.chat.demo.ChannelModel
import com.twilio.chat.demo.R
import de.hdodenhof.circleimageview.CircleImageView
import eu.inloop.simplerecycleradapter.SettableViewHolder
import kotterknife.bindView
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.warn

class ChannelViewHolder(context: Context, parent: ViewGroup) : SettableViewHolder<ChannelModel>(context, R.layout.dialog_list, parent), AnkoLogger {
    //    val friendlyName: TextView by bindView(R.id.channel_friendly_name)
//    val channelSid: TextView by bindView(R.id.channel_sid)
//    val updatedDate: TextView by bindView(R.id.channel_updated_date)
//    val createdDate: TextView by bindView(R.id.channel_created_date)
//    val usersCount: TextView by bindView(R.id.channel_users_count)
//    val totalMessagesCount: TextView by bindView(R.id.channel_total_messages_count)
//    val unconsumedMessagesCount: TextView by bindView(R.id.channel_unconsumed_messages_count)
//    val lastMessageDate: TextView by bindView(R.id.channel_last_message_date)
//
//
    val avatar: CircleImageView by bindView(R.id.dialogAvatar)
    val friendlyName: TextView by bindView(R.id.dialogName)
    val lastMessageDate: TextView by bindView(R.id.dialogDate)
    val channelSid: TextView by bindView(R.id.dialogMessage)

    override fun setData(channel: ChannelModel) {
        warn { "setData for ${channel.friendlyName} sid|${channel.sid}|" }
        friendlyName.text = channel.friendlyName
        channelSid.text = channel.dateCreatedAsDate!!.toString()
//
//        updatedDate.text = if (channel.dateUpdatedAsDate != null)
//            channel.dateUpdatedAsDate!!.toString()
//        else
//            "<no updated date>"
//
//        createdDate.text = if (channel.dateCreatedAsDate != null)
//            channel.dateCreatedAsDate!!.toString()
//        else
//            "<no created date>"
//
//        channel.getUnconsumedMessagesCount(object : CallbackListener<Long>() {
//            override fun onSuccess(value: Long?) {
//                Log.d("ChannelViewHolder", "getUnconsumedMessagesCount callback")
//                unconsumedMessagesCount.text = "Unread " + value!!.toString()
//            }
//        })
//
//        channel.getMessagesCount(object : CallbackListener<Long>() {
//            override fun onSuccess(value: Long?) {
//                Log.d("ChannelViewHolder", "getMessagesCount callback")
//                totalMessagesCount.text = "Messages " + value!!.toString()
//            }
//        })
//
//        channel.getMembersCount(object : CallbackListener<Long>() {
//            override fun onSuccess(value: Long?) {
//                Log.d("ChannelViewHolder", "getMembersCount callback")
//                usersCount.text = "Members " + value!!.toString()
//            }
//        })
//
//        val lastmsg = channel.lastMessageDate;
//        if (lastmsg != null) {
//            lastMessageDate.text = lastmsg.toString()
//        }
//
//        itemView.setBackgroundColor(
//            if (channel.status == ChannelStatus.JOINED) {
//                if (channel.type == ChannelType.PRIVATE)
//                    Color.BLUE
//                else
//                    Color.WHITE
//            } else {
//                if (channel.status == ChannelStatus.INVITED)
//                    Color.YELLOW
//                else
//                    Color.GRAY
//            }
//        )
    }
}
