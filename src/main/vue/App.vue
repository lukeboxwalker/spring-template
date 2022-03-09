<template>
    <div id="app">
        <HelloWorld msg="Welcome to Your Vue.js App!"/>
        <HelloWorld v-bind:msg="backendData"/>
    </div>
</template>

<script setup>
import HelloWorld from './components/HelloWorld.vue'
import {ref} from 'vue'
import axios from 'axios'


const backendData = ref("")
axios.get("http://localhost:8088/hello-world")
    .then(response => backendData.value = response.data)
    .catch(e => console.log(e));


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
