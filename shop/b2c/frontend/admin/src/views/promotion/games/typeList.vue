<template>
  <div>
    <h3>互动游戏</h3>
    <ul class="clearfix">

      <li class="application-item">
        <a href="/promotion/games/edit.html?type=3">
          <div class="application-logo"><img src="@/assets/img/games/b4c30bad203a9ad37c92b7c52d5d422d.png" alt=""></div>
          <div class="application-name">刮刮卡</div>
          <div class="application-desc">通过刮开卡片进行抽奖的玩法</div>
        </a>
      </li>

      <li class="application-item">
        <a href="/promotion/games/edit.html?type=4">
          <div class="application-logo"><img src="@/assets/img/games/03aa1ac9b94e2b9c47f47360e98c25c0.png" alt=""></div>
          <div class="application-name">幸运砸蛋</div>
          <div class="application-desc">好运砸出来</div>
        </a>
      </li>

      <li class="application-item">
        <a href="/promotion/games/edit.html?type=5">
          <div class="application-logo"><img src="@/assets/img/games/57ebd7f399284e9eb7f2a779bec77362.png" alt=""></div>
          <div class="application-name">幸运大抽奖</div>
          <div class="application-desc">常见的转盘式抽奖玩法</div>
        </a>
      </li>

    </ul>
  </div>
</template>
<style lang="scss" scoped>

h3 {
  font-size: 14px;
  color: #333;
  margin-top: 0;
  margin-bottom: 10px;
  font-weight: 700;
}

.clearfix {
    zoom: 1;
}

ul {
  margin: 0;
  padding: 0;
  list-style-type: none;

  li {
    float: left;
    width: 240px;
    margin-right: 15px;
    margin-bottom: 20px;
    background: #f8f8f8;

    > a {
      zoom: 1;
      display: block;
      padding: 10px;
    }

    .application-logo {
      float: left;
      width: 40px;
      height: 40px;
      border-radius: 4px;
    }

    .application-item img{
      width: 40px;
      height: 40px;
      vertical-align: bottom;
      border: none;
    }

  }
}

.application-item .application-name {
  font-size: 14px;
    height: 24px;
    line-height: 24px;
    vertical-align: bottom;
    color: #333;
    font-weight: 700;
    margin-left: 50px;
}

.application-item .application-desc {
  margin-left: 50px;
  font-size: 12px;
    height: 16px;
    line-height: 16px;
    vertical-align: top;
    color: #999;
    text-overflow: ellipsis;
    white-space: nowrap;
    overflow: hidden;
}
</style>
