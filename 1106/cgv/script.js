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


// 여기부터 제이쿼리?
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
  });

  $('.specialHall_list li').on('mouseover', function(){
    const index = $(this).index();
    $('.specialHall_list li').removeClass('on');
    $(this).addClass('on');

    $('.tapContent > a').css('display', 'none');
    $('.tapContent > a').eq(index).css('display', 'block');
  })
  
});