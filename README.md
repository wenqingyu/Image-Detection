# Image-Detection
Image-Detection

In this project, we try to take a picture of housestocks (animals) from Mobile App, then send this picture back to algorithm and analyse housestock's volume and therefore estimate the weight of this housestock.
We used Canny Detector Library from http://www.tomgibara.com/computer-vision/polar-boundary.

In original library, it do not provide data arrary of each edge points' position, we modified it so you can get edge data pixel location by using:
CannyEdgeDetector.getEdgeData() (ArrayList<Cell> Type)

