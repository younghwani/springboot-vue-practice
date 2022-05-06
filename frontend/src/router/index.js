import { createRouter, createWebHistory } from "vue-router";
import HelloWorld from "@/components/HelloWorld";

const routes = [
    {
        path: '/',
        name: 'HelloWorld',
        props(route) {
            return { msg: route.params.msg }
        },
        component: HelloWorld
    },
    {
        path: '/helloworld2',
        name: 'HelloWorld2',
        props(route) {
            return { msg: route.params.msg }
        },
        component: () => import('@/components/HelloWorld2')
    },
    {
        path: '/postlist',
        name: 'PostList',
        props(route) {
            return { msg: route.params.msg }
        },
        component: () => import('@/components/PostList')
    }
];

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
});

export default router;