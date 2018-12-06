<template>
  <div>
    <h1 v-cloak>{{ msg }}, 登陆组件, 使用.vue文件定义</h1>
  </div>
</template>

<script>
  export default {
    data: () => { // 组件中的data必须是一个function
      return {
        msg: 'Hello'
      };
    },
    methods: {
      show: () => {
        console.info("使用了login.vue中的show方法")
      }
    }
  }
</script>

<style>

</style>