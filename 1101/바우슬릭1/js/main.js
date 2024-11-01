$(function(){
    var pc_prev = $('.pc-slide .prev-btn');
    var pc_next = $('.pc-slide .next-btn');
    var mo_prev = $('.mo-slide .prev-btn');
    var mo_next = $('.mo-slide .next-btn');

    var $slick =  $('.pc-slide ul');
// pc용
    $slick.slick({
        autoplay: true,
        prevArrow: pc_prev,
        nextArrow: pc_next,
        dots: true,
    });
//mobile용

    
    $('.mo-slide ul').slick({
        autoplay: true,
        prevArrow: mo_prev,
        nextArrow: mo_next,
    })


    $(window).resize(function(){
        var w = $(this).width();
        if(w >= 800){
            mo_prev.hide();
            mo_next.hide();
        } else{
            mo_prev.show();
            mo_next.show();
        }
    })
    $(window).trigger('resize');

    // slick 슬라이드 최초실행될 때
    $slick.on('init', function(){
        
    });
    // slick 슬라이드가 바뀔때
    $slick.on('afterChange', function(event, slick, currentSlide){
        $('.num p strong').html(currentSlide + 1);
    });
    $('.play').click(function(){
        if($(this).hasClass('on')){
            $(this).removeClass('on');
        } else{
            $(this).addClass('on');
            $slick.slick('slickpause');
        }
        return false
    });
});