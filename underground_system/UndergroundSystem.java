public class UndergroundSystem {
    HashMap<Integer,StationInfo> startStationsMap = null;
        HashMap<String,HashMap<String,AverageData>>  endStationsMap= null;

        public UndergroundSystem() {
            startStationsMap = new   HashMap<Integer,StationInfo>() ;
            endStationsMap = new    HashMap<String,HashMap<String,AverageData>> ();
        }

        class  AverageData{
            double sum;
            int number;
            AverageData(int sum, int number){
                this.sum=sum;
                this.number=number;
            }
        }



        class StationInfo{
            String stationName ;
            int checkInTime ;
            StationInfo(int time , String stationName){
                this.checkInTime=time;
                this.stationName=stationName;
            }
        }


        public void checkIn(int id, String stationName, int t) {
            startStationsMap.put(id,new StationInfo(t,stationName));
        }

        public void checkOut(int id, String stationName, int t) {
            StationInfo stationInfo= startStationsMap.get(id);
            HashMap<String,AverageData> stationMap = endStationsMap.get(stationName);
            int timeDiff=t-stationInfo.checkInTime;

            if(stationMap == null){
                stationMap=new HashMap<String,AverageData>();
            }
            AverageData averageData= stationMap.get(stationInfo.stationName);

            if (averageData== null){
                stationMap.put(stationInfo.stationName,new AverageData(timeDiff,1));
            }else{
                averageData.number ++;
                averageData.sum +=timeDiff;
                stationMap.put(stationInfo.stationName,averageData);
            }
            endStationsMap.put(stationName,stationMap);
        }

        public double getAverageTime(String startStation, String endStation) {
            HashMap<String,AverageData> stationUsers = endStationsMap.get(endStation);
            AverageData  result= stationUsers.get(startStation);

            return  result.sum/result.number;
        }
}
