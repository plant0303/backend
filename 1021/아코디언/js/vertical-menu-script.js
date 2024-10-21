const menuLiA = document.querySelectorAll('.m_menu > li > a');
const sub = document.querySelectorAll('.sub');
menuLiA.forEach(function(item){
    item.addEventListener('click', function(e){
        var subHeight = getComputedStyle(e.target.nextElementSibling).height;

        if(subHeight <= '0px'){
            slideUp();
            this.nextElementSibling.style.height = '108px';
        } else{
            this.nextElementSibling.style.height = '108px';
        }
    })
})

function slideUp(){
    sub.forEach(function(item){
        item.style.height = '0px';
    })
}