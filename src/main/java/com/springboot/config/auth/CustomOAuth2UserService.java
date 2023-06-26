package com.springboot.config.auth;


//@RequiredArgsConstructor
//@Service
//public class CustomOAuth2UserService implements OAuth2UserService<OAuth2UserRequest, OAuth2User>{
//    private final MemberRepository memberRepository;
//    private final HttpSession httpSession;

//@Override
//    public OAuth2User loadUser(OAuth2UserRequest userRequest)throws OAuth2AuthenticationException{
//        OAuth2UserService<OAuth2UserRequest, OAuth2User>
//                delegate = new DefaultOAuth2UserService();
//        OAuth2User oAuth2User = delegate.loadUser(userRequest);
//        //registrationId - 현재 로그인 진행 중인 서비스를 구분하는 코드입니다.
//        //지금은 구글만 사용하는 불필요한 값이지만, 이후 네이버 로그인 연동시에
//        //네이버 로그인인지, 구글 로그인인지 구분하기 위해 사용합니다.
//        String registrationId = userRequest.getClientRegistration().getRegistrationId();
//
//        //userNameAttributeName - OAuth2 로그인 진행 시 키가 되는 필드 값을 이야기 합니다. Primary Key와 같은 의미입니다.
//        //구글의 경우 기본적으로 코드를 지원하지만, 네이버 카카오등은 기본 지원하지 않습니다. 구글의 기본 코드는 sub입니다.
//        //이후 네이버 로그인과 구글 로그인을 동시 지원할 때 사용됩니다.
//        String userNameAttributeName = userRequest.getClientRegistration().getProviderDetails()
//                .getUserInfoEndpoint().getUserNameAttributeName();
//
//        //OAuth2UserService를 통해 가져온 OAuth2User의 attribute를 담을 클래스입니다.
//        //이후 네이버 등 다른 소셜 로그인도 이 클래스를 사용합니다.
//        OAuthAttributes attributes = OAuthAttributes.of(registrationId, userNameAttributeName, oAuth2User.getAttributes());
//
//        Member member = saveOrUpdate(attributes);
//
//        //SessionUser - 세션에 사용자 정보를 저장하기 위한 Dto 클래스입니다.
//        //왜 User 클래스를 쓰지 않고 새로 만들어서 쓰는지 설명하겠습니다.
//        httpSession.setAttribute("google", new SessionUser(member));
//
//        return new DefaultOAuth2User(Collections.singleton(new SimpleGrantedAuthority(member.getRoleKey())),
//                attributes.getAttributes(),
//                attributes.getNameAttributeKey());
//    }
//
//    private Member saveOrUpdate(OAuthAttributes attributes){
//        Member member = memberRepository.findByEmail(attributes.getEmail())
//                .map(entity -> entity.update(attributes.getName(), attributes.getPicture()))
//                .orElse(attributes.toEntity());
//
//        return memberRepository.save(member);
//    }
//}
