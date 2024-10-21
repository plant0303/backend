const liA = document.querySelectorAll('.m_menu > li a');
const sub = document.querySelectorAll('.sub');

liA.forEach(function(list){
    list.addEventListener('click', function(e){
        var height = getComputedStyle(e.target.nextElementSibling).height;
        if(height <= 0){
            slideUp();
            e.target.nextElementSibling.style.height = '100px';
        } else{
            e.target.nextElementSibling.style.height = '100px';
        }
    });
});
function slideUp(){
    sub.forEach(function(item){
        item.style.height = '0px';
    })
}