/**
 * Created by Louie on 2017-08-16.
 */
/**
 * timestamp转换成datetime
 * @param time
 * @param mode en:2017-01-01;cn:2017年1月1日
 * @returns {*}
 */
function timeStamp2String (time, mode){
    if (time == null) {
        return "";
    }
    var datetime = new Date();
    datetime.setTime(time);
    var year = datetime.getFullYear();
    var month = datetime.getMonth() + 1;
    var date = datetime.getDate();
    var hour = datetime.getHours();
    var minute = datetime.getMinutes();
    var second = datetime.getSeconds();
    var mseconds = datetime.getMilliseconds();
    // return year + "-" + addZero(month) + "-" + addZero(date)+" "+ addZero(hour)+":"+addZero(minute)+":"+addZero(second);
    if (mode == 'cn') {
        return year + "年" + month + "月" + date + "日";
    }
    return year + "-" + addZero(month) + "-" + addZero(date);
};

//创建补0函数
function addZero(s) {
    return s < 10 ? '0' + s : s;
}

/**
 * @description 根据时间获取时间戳
 * @author louiemain
 * @date Created on 2017-12-29 11:33
 * @param null
 * @return
 */
function string2Timestamp(str) {
    return Date.parse(str);
}

/**
 * @description 生成uuid
 * @author louiemain
 * @date Created on 2018-01-26 15:38
 * @param null
 * @return
 */
function guid() {
    return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
        var r = Math.random()*16|0, v = c == 'x' ? r : (r&0x3|0x8);
        return v.toString(16);
    });
}