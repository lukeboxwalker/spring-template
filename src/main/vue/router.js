import HelloWorld from "./components/HelloWorld.vue";
import PageNotFound from "./components/PageNotFound.vue";

import {createRouter, createWebHistory} from "vue-router";

const routes = [
    {path: '/', component: HelloWorld},
    {path: '/:pathMatch(.*)*', name: 'NotFound', component: PageNotFound}
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router
