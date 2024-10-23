$(function(){
    // 화면 사이즈 조절 resize
    $(window).resize(function(){
        var w = $(this).width();
        console.log(w);
        if(w < 850){
            $('.sub').css('display', 'none');
        } else{
            if($('.mobile_nav').hasClass('active')){
                $('.mobile_nav').removeClass('active');
                $('.transparency').removeClass('active');
            }
        }
        if(w > 850){
            $('.sub').css('display', 'block');
        }

        
    })
    // PC 네비게이션 hover
    $('.nav > ul').mouseover(function(){
        $(this).addClass('over');
    });
    $('.nav > ul').mouseleave(function(){
        $(this).removeClass('over');
    });

    // 메뉴 열기
    $('.mobile_tab').click(function(){
        $('.mobile_nav').addClass('active');
        $('.transparency').addClass('active');
    })

    // 메뉴 닫기
    $('.close').click(function(){
        $('.mobile_nav').removeClass('active');
        $('.transparency').removeClass('active');
        $('.mobile_nav .sub').css('display', 'none');
    })

    // 모바일 메뉴 아코디언 
    $('.mobile_nav > ul > li > a').click(function(){
        var slide = $(this).next('.sub').css('display');
        if(slide == 'none'){
            $('.sub').slideUp();
            $(this).next('.sub').slideDown();
        } else{
            $(this).next('.sub').slideUp();
        }
    })
});