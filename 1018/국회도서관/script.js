// tabmenu
const tabMenuList = document.querySelectorAll('.tabMenuList li a');
const tabContent = document.querySelectorAll('.tabContent>div');

tabMenuList.forEach(function(menus){
    menus.addEventListener("click", function(e){
        e.preventDefault();
        let menuTarget = e.target.getAttribute('href').replace("#", "");
        console.log(menuTarget);
        
        tabContent.forEach(function(content){
            content.style.display = "none";
        });
        document.getElementById(menuTarget).style.display = "block";
        
        tabMenuList.forEach(function(ac){
            ac.classList.remove("active");
        });
        menus.classList.add("active");
    })
})

// slide
const slideBanner = document.querySelector('.slide ul');
const slides = document.querySelectorAll('.slide ul li');
const li_width = document.querySelector('.slide ul li').offsetWidth;
const li_length = slides.length;

const prev = document.querySelector('#prev');
const next = document.querySelector('#next');
const now_page = document.querySelector('#now_page');
const total_page = document.querySelector('#total_page');

let num = 0;

next.addEventListener("click", function(){
    num= (num + 1) % li_length;
    slideBanner.style.marginLeft = `${-li_width * num}px`
    slideBanner.style.transition = "0.5s";
    indexNum(num);
});
prev.addEventListener("click", function(){
    num = (num - 1 + li_length) % li_length;
    slideBanner.style.marginLeft = `${-li_width * num}px`
    slideBanner.style.transition = "0.5s";
    indexNum(num);
});

function autoPlay(){
    // num이 li_length(슬라이드 개수)와 같아지면 0으로 리셋
    if (num >= li_length) {
        num = 0;
        slideBanner.style.transition = "none"; // transition을 제거
        slideBanner.style.marginLeft = "0px"; // 슬라이드를 처음으로 이동
    } else {
        
        slideBanner.style.marginLeft = `${-li_width * num}px`; // 일반 슬라이드 이동
        slideBanner.style.transition = "margin-left 0.5s"; // 슬라이드 이동 애니메이션
    }
    indexNum(num);
    
    num++; // 다음 슬라이드로 이동
}
setInterval(autoPlay, 3000);

function indexNum(num){
    now_page.innerHTML = '';
    now_page.innerHTML = num + 1;
}

var create_totalNode = document.createTextNode(li_length);
total_page.appendChild(create_totalNode);