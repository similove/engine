import VueRouter from 'vue-router'

import account from '../components/Account.vue'
import goodList from '../components/GoodList.vue'
import login from '../sub-components/login.vue'
import register from '../sub-components/register.vue'

const index = new VueRouter({
  routes: [
    {
      path: '/account',
      component: account,
      children:[
        {path: 'login', component: login},
        {path: 'register', component: register}
      ]
    },
    {
      path: '/goodList',
      component: goodList
    }
  ]
});

export default index