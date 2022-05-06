<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <div id="nav">
    <router-link :to="{name:'HelloWorld', params: { msg: 'This is HelloWorld Page!' }}">HelloWorld</router-link>
    <router-link :to="{name:'HelloWorld2', params: { msg: 'This is HelloWorld2 Page!' }}">HelloWorld2</router-link>
    <router-link :to="{name:'PostList', params: { msg: 'This is Post Page!' }}">PostList</router-link>
  </div>
  <router-view />
</template>

<script>

export default {
  name: 'App',
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
