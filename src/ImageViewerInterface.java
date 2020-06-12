public interface ImageViewerInterface {

    // ImageViewerInterface를 구현하는 클래스 모듈의 이름을 반환
    String getName();

    // 확장자, 로딩한다는 표시만 출력
    void show(String fileName);

    // 문자열 형태로 반환
    String getExtension();
}
