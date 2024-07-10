<template>
  <header>
    <div class="corner author-info">
      <p>Мария Владимировна Кобзарь</p>
      <p>P3215</p>
    </div>
    <div class="project-name" @click="$router.push('/')">
      <h1>Лабораторная работа #4</h1>
    </div>
    <div class="corner variant">
      <p>Вариант: 8764</p>
      <button
        v-if="$store.state.auth.status.loggedIn"
        @click="logout"
        class="mt-4 btn btn-danger"
      >
        Logout
      </button>
    </div>
  </header>
</template>

<script>
export default {
  methods: {
    logout() {
      this.$store.dispatch("auth/logout");
      this.$router.push("/");
    },
  },
};
</script>

<style scoped>
header {
  padding: 15px 25px;
  display: flex;
  flex-flow: row nowrap;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 20px;
}

.corner {
  width: 220px;
  height: 80px;
}

button {
  margin-top: 0 !important;
}

.project-name {
  text-align: center;
  cursor: pointer;
}

.variant {
  text-align: right;
}
</style>
