<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title> 투어리스트인투어 </title>
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="/resources/css/swiper.min.css">
    <link rel="stylesheet" href="/resources/css/common.css">
    <script src="/resources/js/jquery-1.11.3.min.js"></script>
    <script src="/resources/js/rollmain.js"></script>
    <script src="/resources/js/jquery.easing.js"></script>
    <script src="/resources/js/common.js"></script>
    <script src="/resources/js/jquery.smooth-scroll.min.js"></script>
    <!--[if lte IE 9]>
    <script src="/resources/js/html5shiv.js"></script>
    <script src="/resources/js/placeholders.min.js"></script>
    <![endif]-->
</head>
<body>
<ul class="skipnavi">
    <li><a href="#container">본문내용</a></li>
</ul>
<!-- wrap -->
<div id="wrap">

    <header id="header">
        <div class="header_area box_inner clear">
            <h1><a href="index.html">Tourist in tour</a></h1>
            <p class="openMOgnb"><a href="#"><b class="hdd">메뉴열기</b> <span></span><span></span><span></span></a></p>
            <!-- header_cont -->
            <div class="header_cont">
                <ul class="util clear">
                    <li><a href="login.html">로그인</a></li>
                    <li><a href="join.html">회원가입</a></li>
                </ul>
                <nav>
                    <ul class="gnb clear">
                        <li><a href="javascript:;" class="openAll1">여행정보</a>

                            <div class="gnb_depth gnb_depth2_1">
                                <ul class="submenu_list">
                                    <li><a href="javascript:;">국내</a></li>
                                    <li><a href="javascript:;">해외</a></li>
                                </ul>
                            </div>
                        </li>
                        <li><a href="javascript:;" class="openAll2">고객센터</a>
                            <div class="gnb_depth gnb_depth2_2">
                                <ul class="submenu_list">
                                    <li><a href="notice_list.html">공지사항</a></li>
                                    <li><a href="javascript:;">문의하기</a></li>
                                </ul>
                            </div>
                        </li>
                        <li><a href="javascript:;" class="openAll3">상품투어</a>
                            <div class="gnb_depth gnb_depth2_3">
                                <ul class="submenu_list">
                                    <li><a href="program.html">프로그램 소개</a></li>
                                    <li><a href="javascript:;">여행자료</a></li>
                                </ul>
                            </div>
                        </li>
                        <li><a href="javascript:;" class="openAll4">티켓/가이드</a>
                            <div class="gnb_depth gnb_depth2_4">
                                <ul class="submenu_list">
                                    <li><a href="javascript:;">항공</a></li>
                                    <li><a href="javascript:;">호텔</a></li>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </nav>
                <p class="closePop"><a href="javascript:;">닫기</a></p>
            </div>
            <!-- //header_cont -->
        </div>
    </header>

    <div id="container">
        <div class="main_rolling_pc">
            <div class="visualRoll">
                <ul class="viewImgList">
                    <li class="imglist0">
                        <div class="roll_content">
                            <a href="javascript:;">
                                <img src="/resources/img/img_slidecontents01.png" alt="TRUST & INFORMATION 믿을 수 있는 여행정보, 여행... 어디로 가세요?"></a>
                            <p class="roll_txtline">BE TOURIST FOR BETTER LIFE</p>
                        </div>
                    </li>
                    <li class="imglist1">
                        <div class="roll_content">
                            <a href="javascript:;">
                                <img src="/resources/img/img_slidecontents02.png" alt="TRUST & INFORMATION 믿을 수 있는 여행정보, 여행... 어디로 가세요?"></a>
                            <p class="roll_txtline">BE TOURIST FOR BETTER LIFE</p>
                        </div>
                    </li>
                    <li class="imglist2">
                        <div class="roll_content">
                            <a href="javascript:;">
                                <img src="/resources/img/img_slidecontents03.png" alt="TRUST & INFORMATION 믿을 수 있는 여행정보, 여행... 어디로 가세요?"></a>
                            <p class="roll_txtline">BE TOURIST FOR BETTER LIFE</p>
                        </div>
                    </li>
                </ul>

                <div class="rollbtnArea">
                    <ul class="rollingbtn">
                        <li class="seq butt0"><a href="#butt"><img src="/resources/img/btn_rollbutt_on.png" alt="1번" /></a></li>
                        <li class="seq butt1"><a href="#butt"><img src="/resources/img/btn_rollbutt_off.png" alt="2번" /></a></li>
                        <li class="seq butt2"><a href="#butt"><img src="/resources/img/btn_rollbutt_off.png" alt="3번" /></a></li>
                        <li class="rollstop"><a href="#" class="stop"><img src="/resources/img/btn_roll_stop.png" alt="멈춤" /></a></li>
                        <li class="rollplay"><a href="#" class="play"><img src="/resources/img/btn_roll_play.png" alt="재생" /></a></li>
                    </ul>
                </div><!-- //rollbtnArea -->

            </div><!-- //visualRoll -->
        </div><!-- //main_rolling_pc -->

        <div class="main_rolling_mobile">
            <div class="swiper-container">
                <div class="swiper-wrapper">
                    <div class="swiper-slide">
                        <a href="javascript:;"><img src="/resources/img/mainslide_mob01.jpg" alt="TRUST & INFORMATION 믿을 수 있는 여행정보, 여행... 어디로 가세요?" /></a>
                    </div>
                    <div class="swiper-slide">
                        <a href="javascript:;"><img src="/resources/img/mainslide_mob02.jpg" alt="TRUST & INFORMATION 믿을 수 있는 여행정보, 여행... 어디로 가세요?" /></a>
                    </div>
                    <div class="swiper-slide">
                        <a href="javascript:;"><img src="/resources/img/mainslide_mob03.jpg" alt="TRUST & INFORMATION 믿을 수 있는 여행정보, 여행... 어디로 가세요?" /></a>
                    </div>
                </div>
                <div class="swiper-pagination"></div>
                <!-- <div class="swiper-button-next"></div>
                <div class="swiper-button-prev"></div> -->

            </div><!--//swiper-container-->
        </div><!--//main_rolling_mobile -->

        <!-- about_area -->
        <div class="about_area">
            <h2>다시 찾는 인기 여행지 <b>TOP 3</b></h2>
            <div class="about_box">
                <ul class="place_list box_inner clear">
                    <li><a href="#" onclick="$('.popup_base').css('height',$(document).height());$('.contact_pop').show();">
                        <img class="img_topplace" src="/resources/img/img_topplace01.jpg" alt="다리를 높이 들어 운동" />
                        <h3>성패트릭 대성당</h3>
                        <p class="txt">바쁜 뉴욕 안에서 정교하면서도 웅장한 기운에 침묵하게 되는 기도의 시간!</p>
                        <span class="view">VIEW</span></a>
                    </li>
                    <li><a href="#" onclick="$('.popup_base').css('height',$(document).height());$('.space_pop').show();">
                        <img class="img_topplace" src="/resources/img/img_topplace02.jpg" alt="바닷가에서 스트레칭" />
                        <h3>원주 뮤지엄 '산'</h3>
                        <p class="txt">전시된 유산들을 담아낸 건물에 신비로운 돌과 물의 테마가 담겨 있다.</p>
                        <span class="view">VIEW</span></a>
                    </li>
                    <li><a href="#" onclick="$('.popup_base').css('height',$(document).height());$('.program_pop').show();">
                        <img class="img_topplace" src="/resources/img/img_topplace03.jpg" alt="앉아서 스트레칭" />
                        <h3>일본 만국박람회 기념공원</h3>
                        <p class="txt">오사카 센리 반파쿠에는 드넓은 대지에 정원과 들, 물과 함께 하는 문화가 있다.</p>
                        <span class="view">VIEW</span></a>
                    </li>
                </ul>
            </div>
        </div>
        <!-- //about_area -->

        <!-- app_area -->
        <div class="appbbs_area">
            <div class="appbbs_box box_inner clear">
                <h2 class="hdd">상담과 최근게시물</h2>
                <p class="app_line">
                    <a href="javascript:;">카카오톡 1:1 상담</a>
                    <a href="javascript:;">전화 상담 신청</a>
                </p>
                <div class="bbs_line">
                    <h3>NOTICE</h3>
                    <ul class="notice_recent">
                        <li><a href="javascript:;">이번 여름 휴가 제주 갈까? 미션 투어 (여행경비 50만원 지원)</a></li>
                        <li><a href="javascript:;">박물관 미션 투어 응모 당첨자 발표</a></li>
                        <li><a href="javascript:;">추석 연휴 티켓/투어 배송 및 직접 수령 안내</a></li>
                        <li><a href="javascript:;">하롱베이 서비스 OPEN! (여행정보, 가이드북, 가이드맵)</a></li>
                        <li><a href="javascript:;">투어리스트인투어 서비스 점검 안내</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- //app_area -->

    </div>
    <!-- //container -->

    <footer>
        <div class="foot_area box_inner">
            <ul class="foot_list clear">
                <li><a href="javascript:;">이용약관</a></li>
                <li><a href="javascript:;">개인정보취급방침</a></li>
            </ul>
            <h2>투어리스트인투어</h2>
            <p class="addr">서울특별시 종로구 혜화동 9길 청운빌딩 5층 <span class="gubun">/</span>
                <span class="br_line">대표전화 <span class="space0">02-1234-5678</span> <span class="gubun">/</span>
					<span class="br_line">E-mail : <span class="space0"> titour@touristintour.com</span></span>
				</span>
            </p>
            <p class="copy box_inner">Copyright(c) TouristInTour all right reserved</p>
            <ul class="snslink clear">
                <li><a href="javascript:;">blog</a></li>
                <li><a href="javascript:;">facebook</a></li>
                <li><a href="javascript:;">instargram</a></li>
            </ul>
        </div>
    </footer>

</div>
<!-- //wrap -->

<h2 class="hdd">빠른 링크 : 전화 문의,카카오톡,오시는 길,꼭대기로</h2>
<div class="quick_area">
    <ul class="quick_list">
        <li><a href="tel:010-7184-4403"><h3>전화 문의</h3><p>010-1234-5678</p></a></li>
        <li><a href="javascript:;"><h3>카카오톡 <em>상담</em></h3><p>1:1상담</p></a></li>
        <li><a href="javascript:;"><h3 class="to_contact">오시는 길</h3></a></li>
    </ul>
    <p class="to_top"><a href="#layout0" class="s_point">TOP</a></p>
</div>

<script type="text/javascript" src="/resources/js/swiper.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        var swiper = new Swiper('.swiper-container', {
            loop: true,
            autoplay:5500,
            autoplayDisableOnInteraction: false,
            pagination: '.swiper-pagination',
            paginationClickable: true
        });
    });
</script>

<!-- contact_pop -->
<div class="popup_base contact_pop">
    <div class="pop_content">
        <p class="btn_xpop"><a href="#" onclick="$(this).parent().parent().parent().hide();">닫기</a></p>
        <ul class="pop_list">
            <li>
                <h2 class="tit_pop">성패트릭 대성당</h2>
                <img class="pop_img"src="/resources/img/img_pop1_1.jpg" alt="성패트릭 대성당" />
                <div class="pop_txt"><p>뉴욕에서 만난 아름다운 고딕양식에 감탄을 금할 수 없습니다. <br>인상적인 예술작품들과 함께 하고 있으며 정교한 구조와 섬세한 조각들을 만날 수 있습니다. </p></div>
            </li>
        </ul>
    </div>
</div>
<!-- //contact_pop -->

<!-- space_pop -->
<div class="popup_base space_pop">
    <div class="pop_content">
        <p class="btn_xpop"><a href="#" onclick="$(this).parent().parent().parent().hide();">닫기</a></p>
        <ul class="pop_list">
            <li>
                <h2 class="tit_pop">원주 뮤지엄 '산'</h2>
                <img class="pop_img"src="/resources/img/img_pop2_1.jpg" alt="뮤지엄 산의 물위의 건물" />
                <div class="pop_txt"><p>실내와 야외, 문화와 자연이 공존하는 세계. <br> 뮤지엄 산은  휴식과 소통이 어울러진 복합공간을 추구합니다. </p></div>
            </li>
            <li>
                <h2 class="tit_pop">박물관 야외</h2>
                <img class="pop_img"src="/resources/img/img_pop2_2.jpg" alt="박물관 야외조경" />
                <div class="pop_txt"><p>공간에 대한 관람을 최대한 배려하려고 합니다.<br>뮤지엄 산은 돌과 물과 산이 함께 어울림으로 배치된 조형 공간입니다.</p></div>
            </li>
        </ul>
    </div>
</div>
<!-- //space_pop -->

<!-- program_pop -->
<div class="popup_base program_pop">
    <div class="pop_content">
        <p class="btn_xpop"><a href="#" onclick="$(this).parent().parent().parent().hide();">닫기</a></p>
        <ul class="pop_list">
            <li>
                <h2 class="tit_pop">일본 만국박람회 기념 공원</h2>
                <img class="pop_img"src="/resources/img/img_pop3_1.jpg" alt="일본 만국박람회 기념 공원" />
                <div class="pop_txt"><p>센리 반파쿠 기념 공원에서는 일본 정원의 확장판을 만날 수 있습니다.<br>가능한 가장 넓은 공간에 꾸민 연못, 산림욕, 정원, 산책길을 만끽할 수 있습니다.</p></div>
            </li>
        </ul>
    </div>
</div>
<!-- //program_pop -->

</body>
</html>
