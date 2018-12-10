<template>
  <div>
    <el-row>
      <el-col :span="6" :offset="9">
        <el-form :label-position="labelPosition" label-width="60px" :model="formData">
          <el-form-item label="用户名:">
            <el-input v-model="formData.username"></el-input>
          </el-form-item>
          <el-form-item label="密码:" prop="pass">
            <el-input type="password" v-model="formData.password" autocomplete="off"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary">登陆</el-button>
            <el-button type="primary" plain>注册</el-button>
          </el-form-item>
        </el-form>
      </el-col>
    </el-row>

  </div>
</template>

<script>
  export default {
    data() {
      return {
        labelPosition: 'right',
        formData: {
          username: '',
          password: '',
        }

      };
    }
  }
</script>

<style scoped lang="scss">

</style>