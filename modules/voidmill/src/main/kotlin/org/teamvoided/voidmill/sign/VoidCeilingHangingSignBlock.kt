package org.teamvoided.voidmill.sign

import net.minecraft.block.WoodType
import net.minecraft.block.sign.CeilingHangingSignBlock

@Suppress("unused")
class VoidCeilingHangingSignBlock(woodType: WoodType, settings: Settings) :
    CeilingHangingSignBlock( woodType, settings), VoidSign

