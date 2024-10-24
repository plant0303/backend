// const targetLink = document.querySelectorAll('.tab_menu a');
// const tabContent = document.querySelectorAll('#tabContent>div');

// // targetLink 배열을 forEach로 순회
// targetLink.forEach(function(link){
//     link.addEventListener('click', function(e){
//         e.preventDefault();
//         let orgTarget = e.target.getAttribute('href'); // or  e.target -> this로 변경 가능, 
//         let tabTarget = orgTarget.replace("#", "");
        
//         tabContent.forEach(function(content){
//             content.style.display = "none";
//         });
//         document.getElementById(tabTarget).style.display = "block"; //querySelector로 하면 # 안떼도 됨
        
//         // targetLink.forEach((link2) => {
//         //     link2.classList.remove("active");
//         //     this.classList.add('active');
//         // })
//         targetLink.forEach(function(link2){
//             link2.classList.remove("active");
//             e.target.classList.add('active');
//         })
//     });

// });

// jquery로 바꾸기
$(function(){
    $(".tab_menu a").click(function(){
        let orgTarget = $(this).attr('href');

        $('#tabContent > div').hide();

        $(orgTarget).show();
        $('.tab_menu a').removeClass('active');
        $(this).addClass('active');

        return false;
    })
})