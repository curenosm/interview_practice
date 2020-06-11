func firstDuplicate(a []int) int {
    myMap := map[int]bool{}
    for _, num := range a {
        if myMap[num] == true {
            return num
        }
        myMap[num]=true
    }
    return -1
}

