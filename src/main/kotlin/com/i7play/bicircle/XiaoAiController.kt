package com.i7play.bicircle

import com.google.gson.Gson
import com.i7play.bicircle.bean.AIReq
import com.i7play.bicircle.bean.resp.AIResp
import com.i7play.bicircle.bean.resp.Response
import com.i7play.bicircle.bean.resp.ToDisplay
import com.i7play.bicircle.bean.resp.ToSpeak
import org.springframework.http.codec.json.Jackson2JsonEncoder
import org.springframework.web.bind.annotation.*


@RestController
class XiaoAiController {
    @PostMapping(value = "/ai")
    fun getUser(@RequestBody query: AIReq): AIResp {
        println(query)

        val response = Response(true, ToDisplay("即将播放消息", 0), ToSpeak("即将播放消息", 0))
        val aiResp = AIResp(true, response, "1.0", null)
        println(aiResp)
        return aiResp
    }
}