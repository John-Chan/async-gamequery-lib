/*
 * MIT License
 *
 * Copyright (c) 2016 Asynchronous Game Query Library
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.ibasco.agql.protocols.valve.steam.webapi.pojos;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;

public class StoreFeaturedApps {
    @SerializedName("large_capsules")
    private List<StoreFeaturedAppInfo> largeCapsulesGames = new ArrayList<>();
    @SerializedName("featured_win")
    private List<StoreFeaturedAppInfo> windowsFeaturedGames = new ArrayList<>();
    @SerializedName("featured_mac")
    private List<StoreFeaturedAppInfo> macFeaturedGames = new ArrayList<>();
    @SerializedName("featured_linux")
    private List<StoreFeaturedAppInfo> linuxFeaturedGames = new ArrayList<>();
    private String layout;
    private int status;

    public List<StoreFeaturedAppInfo> getLargeCapsulesGames() {
        return largeCapsulesGames;
    }

    public void setLargeCapsulesGames(List<StoreFeaturedAppInfo> largeCapsulesGames) {
        this.largeCapsulesGames = largeCapsulesGames;
    }

    public List<StoreFeaturedAppInfo> getWindowsFeaturedGames() {
        return windowsFeaturedGames;
    }

    public void setWindowsFeaturedGames(List<StoreFeaturedAppInfo> windowsFeaturedGames) {
        this.windowsFeaturedGames = windowsFeaturedGames;
    }

    public List<StoreFeaturedAppInfo> getMacFeaturedGames() {
        return macFeaturedGames;
    }

    public void setMacFeaturedGames(List<StoreFeaturedAppInfo> macFeaturedGames) {
        this.macFeaturedGames = macFeaturedGames;
    }

    public List<StoreFeaturedAppInfo> getLinuxFeaturedGames() {
        return linuxFeaturedGames;
    }

    public void setLinuxFeaturedGames(List<StoreFeaturedAppInfo> linuxFeaturedGames) {
        this.linuxFeaturedGames = linuxFeaturedGames;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.NO_CLASS_NAME_STYLE)
                .append("totalLargeCapsuleGames", getLargeCapsulesGames().size())
                .append("totalWindowsFeaturedGames", getWindowsFeaturedGames().size())
                .append("totalMacFeaturedGames", getMacFeaturedGames().size())
                .append("totalLinuxFeaturedGames", getLinuxFeaturedGames().size())
                .append("layout", getLayout())
                .append("status", getStatus())
                .toString();
    }
}
