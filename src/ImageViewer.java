public class ImageViewer {
    private static final int MAX_PLUGINS = 5;

    ImageViewerInterface[] imageViewerInterfaces; // 몰랐던 점 : 생성자에서 배열 초기화할 때, 배열을 생성자 밖에 선언해주어야 다른 함수에서도 사용 가능!!
    private static int index = 0;

    // 배열 선언은 밖에서, 배열 객체 생성은 생성자안에서!!
    public ImageViewer() {
        imageViewerInterfaces = new ImageViewerInterface[MAX_PLUGINS]; // 여기서는 배열 객체 생성만!!
    }

    public void addPlugIn(ImageViewerInterface ivi) {
        imageViewerInterfaces[index] = ivi;
        index++; // index를 1씩 증가시키면서 리스트에 저장
    }

    public void show(String fileName, String ext) {
        index = 0; // 위에서 사용한 index 재활용
        int state = 0; // 리스트에 해당하는 모듈이 있는 상태인지 없는 상태인지 나타내주는 상태 값
        int current = 0; // 만약 그 모듈이 있는지 찾았다면, 그 위치에 해당하는 인덱스를 저장할 수 있는 값

        while(imageViewerInterfaces[index] != null) {
            if(imageViewerInterfaces[index].getExtension() == ext) { // 리스트에서 찾았을 때
                current = index; // 리스트에서 찾았다면 그 인덱스를 current 변수에 저장
                state = 1; // 그리고 상태 값을 1로 바꿈
            }
            index++; // index를 1씩 증가시킴
        }

        if(state == 1) {
            // 해당하는 인덱스를 저장해놓았기 때문에 그 인덱스에서 빼오기만 하면 됨
            System.out.println("Using " + imageViewerInterfaces[current].getName());
            imageViewerInterfaces[current].show(fileName);
        } else {
            // 없는 경우 예외 처리
            System.out.println("Image viewer plugin for the extension, " + ext + ", is not registered");
        }

        /* 오류 발생했던 코드
        while (imageViewerInterfaces[i] != null)
        for(int i = 0; i < 3; i++) {
            if(imageViewerInterfaces[i].getExtension() == ext) {
                System.out.println("Using " + imageViewerInterfaces[i].getName());
                imageViewerInterfaces[i].show(fileName);
            } else {
                System.out.println("Image viewer plugin for the extension, " + ext + ", is not registered");
            }
        } */

        // nullPointerException이 발생했던 이유
        // 5개의 배열 중 모듈이 2개만 채워져있기 때문에, 나머지 원소들은 null 값이 들어가 있음
        // 따라서 값의 비교를 할 때, nullPointerException이 발생할 수 밖에 없음

    }

}
