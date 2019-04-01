layui.use('element', function() {
    function checkLastItem(arr, i) {
        return arr.length == (i + 1);
    }

    function getAhtml(obj){
        return "<a href=\"javascript:;\" onclick=\"addTab('" + obj.name + "','" + obj.url + "')\" >" + obj.name + "</a>";
    }
    //动态菜单
    layui.jquery.ajax({
        // url:"user",
        // method: 'post',
        url:"/js/user.json",
        method:"get",
        success: function(res) {
            var html = "";
            for(var i = 0; i < res.length; i++) {
                var strli = "<li class=\"layui-nav-item lay-unselect \" >";
                if (res[i].url =='#'){
                    strli = strli + "<a href=\"javascript:;\">" + res[i].name + "</a>";
                }else{
                    strli = strli + getAhtml(res[i]);
                }
                if(res[i].pid == "0" && !checkLastItem(res, i) && res[i + 1].pid != "0") {
                    strli = strli + "<dl class=\"layui-nav-child\" >";
                    for(; !checkLastItem(res, i) && res[i + 1].pid != "0"; i++) {
                        strli = strli + "<dd>"+getAhtml(res[i+1])+"</dd>";
                    }
                    strli = strli + "</dl>";
                }
                strli = strli + "</li>";
                html = html + strli;
            }
            layui.jquery("#memus").html(html);
            layui.element.init(); //一定初始化一次
        }
    })
});

//添加选项卡
function addTab(name, url) {
    if(layui.jquery(".layui-tab-title li[lay-id='" + name + "']").length > 0) {
        //选项卡已经存在
        layui.element.tabChange('tabDemo', name);
        layer.msg('切换-' + name)
    } else {
        //动态控制iframe高度
        var tabheight = layui.jquery(window).height() - 95;
        contentTxt = '<iframe src="' + url + '" scrolling="no" width="100%" height="' + (tabheight) + 'PX"></iframe>';
        //新增一个Tab项
        layui.element.tabAdd('tabDemo', {
            title: name,
            content: contentTxt,
            id: name
        })
        //切换刷新
        layui.element.tabChange('tabDemo', name)
        layer.msg('新增-' + name)
    }
}