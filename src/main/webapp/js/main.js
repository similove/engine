const vm = new Vue({
  el: "#app",
  data: {},
  methods: {
    clickHandler: function () {
      console.info("clickHandler")
      //发送get请求
      this.$http.get('../hello').then(function(res){
        console.info(res.body.name)
      },function(){
        console.log('请求失败处理');
      });
    }
  }
});