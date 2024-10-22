const bg = document.querySelector('#black_background');
const tab = document.querySelector('#tab');
const mob_nav = document.querySelector('#mob_nav');

bg.addEventListener('click', function(){
    bg.style.display = "none";
    mob_nav.style.right = -300 + "px";
})

tab.addEventListener('click', function(){
    bg.style.display = "block";
    mob_nav.style.right = 0 + "px";
})