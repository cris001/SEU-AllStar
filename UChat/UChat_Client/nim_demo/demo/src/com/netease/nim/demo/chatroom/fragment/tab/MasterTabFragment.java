package com.netease.nim.demo.chatroom.fragment.tab;

import com.netease.nim.demo.R;
import com.netease.nim.demo.chatroom.fragment.MasterFragment;

/**
 * 主播基类fragment
 * Created by AllStar on 2017/3/4.
 */
public class MasterTabFragment extends ChatRoomTabFragment {
    private MasterFragment fragment;
    @Override
    protected void onInit() {
        fragment = (MasterFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.master_fragment);
    }

    @Override
    public void onCurrent() {
        super.onCurrent();
        if (fragment != null) {
            fragment.onCurrent();
        }
    }
}
