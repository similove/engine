function selectUser() {
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function () {
    if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
      document.getElementById("showWindow").innerHTML = xmlhttp.responseText;
    }
  };
  xmlhttp.open("GET", "hello", true);
  xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
  xmlhttp.send("id=1");
}

const vm = new Vue({
  el: "#app",
  data: {},
  methods: {
    clickHandler: function () {
      console.info("clickHandler")
      //发送get请求
      this.$http.get('hello').then(function(res){
        console.info(res.body.name)
      },function(){
        console.log('请求失败处理');
      });
    }
  }
});