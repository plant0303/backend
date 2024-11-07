const next = document.querySelector('.next');
const prev = document.querySelector('.prev');

const listWrap = document.querySelector('.listWrap');
const lists = document.querySelectorAll('.listWrap > div');

let num = 0;
let show = 5;
let total = lists.length;

const liW = lists[1].offsetWidth + 32;

// clone
for(i = 0; i < 3; i++){
    lists.forEach((i) => {
        const clone = i.cloneNode(true);
        listWrap.append(clone);
    })
}

// 버튼
next.addEventListener('click', function(){
  num++;
  listWrap.style.transition = 'all 0.5s';
  listWrap.style.marginLeft = -liW * num * show + "px";
  console.log(1);
  if(num == 3){
    num = 3;
  }
});

prev.addEventListener('click', function(){
  num--;
  listWrap.style.transition = 'all 0.5s';
  listWrap.style.marginLeft = -liW * num * show + "px";
  console.log(1);

});

$(function(){
  var swiper = new Swiper('.mySwiper', {
    slidesPerView: 3,
    spaceBetween : 30,
    navigation : {
      nextEl : ".swiper-button-next",
      prevEl : ".swiper-button-prev",
    },
    autoplay : true,

  });
  $('.btn_eventCntrol').click(function(){

    if($(this).hasClass('on') == false){
      $(this).addClass('on');
      swiper.autoplay.stop();
    } else{
      $(this).removeClass('on');
      swiper.autoplay.start();
    }

    return false;
  })
  
});