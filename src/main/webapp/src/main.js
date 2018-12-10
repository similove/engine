
import Vue from 'vue'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

Vue.use(VueResource);
Vue.use(ElementUI);
Vue.use(VueRouter);

import app from './components/App.vue'

const vm = new Vue({
  el: "#app",
  render: createElements => createElements(app),
  router: router
});
