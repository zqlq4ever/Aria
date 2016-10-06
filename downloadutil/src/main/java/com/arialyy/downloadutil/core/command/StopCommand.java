package com.arialyy.downloadutil.core.command;

import android.content.Context;
import android.util.Log;

import com.arialyy.downloadutil.util.Task;
import com.arialyy.downloadutil.entity.DownloadEntity;

/**
 * Created by lyy on 2016/9/20.
 * 停止命令
 */
class StopCommand extends IDownloadCommand {

    /**
     * @param context context
     * @param entity  下载实体
     */
    StopCommand(Context context, DownloadEntity entity) {
        super(context, entity);
    }

    @Override public void executeComment() {
        Task task = target.getTask(mEntity);
        if (task != null) {
            target.stopTask(task);
        } else {
            Log.w(TAG, "停止命令执行失败，【调度器中没有该任务】");
        }
    }
}