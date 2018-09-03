<template>
    <div id="app">
        <article class="ns-base-article">
            <Nav/>
            <router-view/>
        </article>
    </div>
</template>

<script>
    require("@/assets/style/common.scss");
    
    // @ is an alias to /src
    import Nav from "@/components/TheNav.vue";
    
    export default {
        name: "app",
        components: {
            Nav
        }
    };
</script>

<style lang="scss">
    
</style>
