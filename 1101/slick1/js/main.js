$(function(){
    var $slick = $('.visual-img');
    $slick.on('afterChange', function(event, slick, currentSlide){
        console.log('total slide', slick.slideCount);
        $('.visual-item').removeClass('active');
        $(this).find('.visual-item').eq(currentSlide).addClass('active');
    })
    $slick.slick({
        // autoplay: true,
        dots: false,
        infinite: true,
        fade: true,
        autoPlaySpeed: 5000
    });

});
