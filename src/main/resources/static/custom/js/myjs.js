/**
 * Created by Louie on 2017-08-16.
 */
// timestamp转换成datetime
function timeStamp2String (time){
    if (time == null) {
        return null;
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
    return year + "-" + addZero(month) + "-" + addZero(date);
};

//创建补0函数
function addZero(s) {
    return s < 10 ? '0' + s : s;
}