webpackJsonp([6],{"+4HQ":function(t,a,e){"use strict";Object.defineProperty(a,"__esModule",{value:!0});var i=e("/xf8"),s=e("wSez");i.default.use(s.PaletteButton);var n={name:"Community",data:function(){return{datelist:[{path:"date1",img:"@/../static/xiao5.jpg",date:"备孕"},{path:"date2",img:"@/../static/xiao1.jpg",date:"孕期"},{path:"date3",img:"@/../static/xiao0.jpg",date:"育儿"},{path:"date4",img:"@/../static/xiao3.jpg",date:"家常"},{path:"date5",img:"@/../static/xiao4.jpg",date:"旅游"}]}},methods:{back:function(){this.$router.push("/life")},main_log:function(t){console.log("main_log",t)},sub_log:function(t){console.log("sub_log",t),this.$refs.target_1.collapse()}}},o={render:function(){var t=this,a=t.$createElement,e=t._self._c||a;return e("div",{staticClass:"box"},[e("header",{staticClass:"header"},[e("ul",[e("li",{on:{click:t.back}},[e("i",{staticClass:"iconfont icon-arrow-right-copy-copy"})]),t._v(" "),t._m(0),t._v(" "),t._m(1)]),t._v(" "),e("div",{staticClass:"datekind"},[e("ul",t._l(t.datelist,function(a,i){return e("router-link",{key:i,attrs:{to:a.path,tag:"li"}},[e("img",{attrs:{src:a.img,alt:""}}),t._v(" "),e("p",[t._v(t._s(a.date))])])}),1)])]),t._v(" "),e("div",{staticClass:"content"},[e("div",{staticClass:"datecon"},[e("router-view")],1)])])},staticRenderFns:[function(){var t=this.$createElement,a=this._self._c||t;return a("li",[a("h5",[this._v("社区")])])},function(){var t=this.$createElement,a=this._self._c||t;return a("li",[a("i",{staticClass:"iconfont icon-fangdajing"})])}]};var c=e("C7Lr")(n,o,!1,function(t){e("O/UX")},"data-v-4f76ea9f",null);a.default=c.exports},"O/UX":function(t,a){}});
//# sourceMappingURL=6.d79febc1ac346dd7e27c.js.map