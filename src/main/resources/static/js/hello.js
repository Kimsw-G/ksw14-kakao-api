let TEMPLATE_ID = 55184;
let JS_KEY = 'e0d2ca5173b1a8e1caeb895fcf89048b';
let WEB_LINK = 'http://49.50.167.14/';
// let WEB_LINK = 'https://naver.com';

Kakao.init(JS_KEY);
function sendMessage(id) {
    Kakao.Link.sendDefault({
        objectType: 'feed',
        content: {
            title: 'GREEN GG',
            description: '그 날, 롤 얼마나 했는지 궁금하다면?',
            imageUrl:
                'http://k.kakaocdn.net/dn/Q2iNx/btqgeRgV54P/VLdBs9cvyn8BJXB3o7N8UK/kakaolink40_original.png',
            link: {
                mobileWebUrl: WEB_LINK,
                webUrl: WEB_LINK,
            },
        },
        
        buttons: [
            {
                title: '웹으로 보기',
                link: {
                    mobileWebUrl: WEB_LINK,
                    webUrl: WEB_LINK,
                },
            }
        ]
    })
}
