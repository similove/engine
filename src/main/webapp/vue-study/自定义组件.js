//1、定义组件的第一中方式: 使用extend定义全局组件，驼峰格式在调用时使用`-`，例如: myCom1调用使用my-com1
Vue.component('myCom1', Vue.extend({
  template: '<h3>这是一个使用Vue.extend定义的组件</h3>'
}));

//2、定义组件的第二种方式:
Vue.component('myCom2', {
  template: '<h3>这是一个使用Vue.component定义的组件</h3>'
});

//3、定义组件的第三种方式:
Vue.component('myCom3', {
  template: '#template1'
});

const vm = new Vue({
  el: "#app",
  data: {},
  methods: {},
  filter: {},
  directives: {},
  components: {
    login: {
      template: "<h2>这是定义的一个私有组件, 引用自己的数据: {{name}},{{age}}</h2>",
      data: () => {
        return {name: "z3", age: 29};
      }
    }
  },
  beforeCreate() {

  },
  created() {

  },
  beforeMount() {

  },
  mounted() {

  },
  beforeUpdate() {

  },
  updated() {

  },
  beforeDestroy() {

  },
  destroyed() {

  }
});