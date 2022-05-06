<template>
  <div class="post">
    <h1>{{ msg }}</h1>
    <p>Post Page!</p>
    <div>
      <div v-for="post in posts" :key="post.no">
        {{ post }}
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'PostList',
  props: {
    msg: String
  },
  data() {
    return {
      posts: null
    }
  },
  methods: {
    fetchData() {
      axios
          .get("http://localhost:8081/api/post/posts")
          .then(res => {
            // console.log(res);
            this.posts = res.data;
          })
          .catch(err => {
            console.log(err);
          });
    }
  },
  created() {
    this.fetchData();
  }
}
</script>

<style scoped>

</style>