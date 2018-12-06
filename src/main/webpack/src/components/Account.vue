<template>
  <div>
    <h4>This is Account vue.</h4>
    <router-link to='/account/login'>登陆</router-link>
    <router-link to='/account/register'>注册</router-link>

    <router-view></router-view>
  </div>
</template>

<script>

</script>

<style scoped lang="scss">
  body {
    div {
      font-style: italic;
    }
  }
</style>