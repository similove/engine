import $ from 'jquery'
// webpack默认只能处理js文件, 无法处理其他非JS类型文件
//如果需要处理css文件，需要安装 style-loader 和css-loader
// cnpm install style-loader css-loader -D

// import Vue from '../node_modules/vue/dist/vue'
import Vue from 'vue'
import VueRouter from 'vue-router'

import app from './components/app.vue'

import router from './router.js'

Vue.use(VueRouter);

// import './css/index.css'
// import './css/index.less'
// import './css/index.scss'
// import 'bootstrap/dist/css/bootstrap.css'

// 1. 导入login.vue组件
// import login from './components/login.vue'
// 2. 默认 webpack无法打包 .vue文件，需要安装相关的loader
// cnpm install vue-loader vue-template-compiler -D
// 3. 在配置文件中新增loader配置项

// const login = {
//   template: '<h1>这是使用网页中的方式创建的组件</h1>'
// };



const vm = new Vue({
  el: "#app",
  render: createElements => createElements(app),
  router
});

// $(function () {
//   $('li:odd').css('backgroundColor', 'blue');
//   $('li:even').css('backgroundColor', function () {
//     return '#' + ' D97634'
//   })
//
// });

//class Person {
//  static info = {name: "z3"};
//}

//console.log(Person.info.name);
//const p = new Person();

//包查找规则
//1. 找项目下node_modules目录
//2. 在node_modules中根据报名找对应的vue目录
//3. 在vue目录中找package.json的包配置文件
//4. 在package.json中找main属性, main属性定义了这个包在被加载时的入口文件

// 总结在webpack中使用vue
// 1. 安装vue的包 cnpm i vue -S
// 2. 由于在webpack中, 推荐使用 .vue 这个组件模板定义组件, 所以需要安装能解析.vue文件的loader
//    cnpm install vue-loader vue-template-compiler -D //不要使用15.x的vue-loader, 有BUG
// 3. 在main.js中导入vue模块, import Vue from 'vue'
// 4. 定义 .vue 结尾的组件, 组件由三部分组成 template script style
// 5. 使用import 导入组件 import loging from '...'
// 6. 创建vm实例, const vm = new  Vue({el:'#app', render: c => c(login)})
// 7. 在页面创建一个id为app的div, 作为vue控制区域