function Quick()
{
    //Setting Time complexities
    document.getElementById("Time_Worst").innerText="O(N^2)";
    document.getElementById("Time_Average").innerText="Θ(N)";
    document.getElementById("Time_Best").innerText="Ω(N)";

    //Setting Space complexity
    document.getElementById("Space_Worst").innerText="O(1)";

    c_delay=0;

    quick_sort(0,arrSize-1);

    // enable_buttons();
}

function quick_partition (start, end)
{
    let i=start-1;
    let piv = div_sizes[end] ;//make the last element as pivot element.
    div_update(divs[end],div_sizes[end],"yellow");//Color update

        for(let j =start; j < end ; j++ )
        {
            //re-arrange the array by putting elements which are less than pivot on one side and which are greater that on other.
            if (div_sizes[ j ] < piv)
            {
                i++;
                // div_update(divs[j],div_sizes[j],"yellow");//Color update

                div_update(divs[i],div_sizes[i],"red");//Color update
                div_update(divs[j],div_sizes[j],"red");//Color update

                let temp=div_sizes[i];
                div_sizes[i]=div_sizes[j];
                div_sizes[j]=temp;

                div_update(divs[i],div_sizes[i],"red");//Height update
                div_update(divs[j],div_sizes[j],"red");//Height update

                div_update(divs[i],div_sizes[i],"blue");//Height update
                div_update(divs[j],div_sizes[j],"blue");//Height update

                
            }
    }
    div_update(divs[end],div_sizes[end],"red");//Color update
    div_update(divs[i+1],div_sizes[i+1],"red");//Color update
    
    let temp=div_sizes[end];//put the pivot element in its proper place.
    div_sizes[end]=div_sizes[i+1];
    div_sizes[i+1]=temp;

    div_update(divs[end],div_sizes[end],"red");//Height update
    div_update(divs[i+1],div_sizes[i+1],"red");//Height update

    for(let t=end;t>=i;t--)
    {
        div_update(divs[t],div_sizes[t],"#0D6EFD");//Color update
    }

    return i+1;//return the position of the pivot
}

function quick_sort (start, end )
{
    if( start < end )
    {
        //stores the position of pivot element
        let piv_pos = quick_partition (start, end ) ;     
        quick_sort (start, piv_pos -1);//sorts the left side of pivot.
        quick_sort (piv_pos +1, end) ;//sorts the right side of pivot.
    }
 }
